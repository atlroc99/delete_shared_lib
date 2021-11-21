import groovy.json.JsonSlurper
def call() {
    println "hello..."
    def json = new JsonSlurper()
    def result = new StringBuilder()
    def error = new StringBuilder()

    def cmd = "aws sts get-caller-identity".execute()
    cmd.consumeProcessOutput(result, error)
    cmd.waitForOrKill(1000)

    println "result of type: ${result.getClass()} and ${result}"
    println error

    def user = json.parseText(result.toString())

    // def process = cmd.execute().text
    // println process.getClass()
    
    // println process
    // def user = jsonSlurper.parseText(process)
    // println "user of class ${user.getClass()}"
    

    
    def userId = user.UserId
    def account = user.Account
    def arn = user.Arn

    println "userId: ${userId}"
    println "account: ${account}"
    println "Arn: ${arn}"

    return user   
}