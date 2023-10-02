def call(credentialsId){

    withSonarQubeEnv(credentialsId: 'sonar-id') {
        sh 'mvn clean package sonar:sonar'
    }
}
