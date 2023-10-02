
def call(credentialsId){

waitForQualityGate abortPipeline: false, credentialsId: 'sonar-api'

}
