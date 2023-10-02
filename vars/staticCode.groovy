def call(credentialsId){

    withSonarQubeEnv(credentialsId: 'sonar-api') {
        sh 'mvn clean package sonar:sonar'
    }
}
