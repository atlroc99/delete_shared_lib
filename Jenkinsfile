@Library('shared-lib-1')_
node {
    stage ("calling sharedlibrary") {
        welcome ('Mohammad Zaman')
    }

    stage ("calling shared lib part 2") {
        welcome("Jon doe")
    }   

    stage ("calling shared lib part 3") {
        welcome("this is part 3")
    } 
    
    stage("Calling Calculator function...") {
        def result = calculator(10,5)
        println "Result: ${result}"
        echo "Result: ${result}"
    }
    
    stage ("get aws user") {
        def user = awsTest()
        println "userId: ${userId}"
        println "account: ${account}"
        println "Arn: ${arn}"
    }

}