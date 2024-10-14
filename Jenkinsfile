pipeline{
agent any
stages
{
 stages {
         stage('Checkout') {
             steps {
                 script {
//                  checkout scm // checkout code from scm
                     // Checkout the specified branch using this we will override the url and branch given by the scm option
                     checkout([$class: 'GitSCM',
                         branches: [[name: "${params.BRANCH_NAME}"]],
                         userRemoteConfigs: [[url: 'https://github.com/DeepMiya/NewCodingPradip.git']]
                     ])
                 }
             }
         }
 stage('Verify POM') {
            steps {
                script {
                    // Print current directory and list files
                    bat "cd"
                    bat "dir"
                }
            }
        }
stage('Build')
{
steps{
echo "Building the code"
bat "mvn clean"
}
}
stage('Test')
{
steps{
script {
                    echo "Running tests with tag: @${params.CUCUMBERTAGS}"
                    bat "mvn test -Dcucumber.filter.tags='${params.CUCUMBERTAGS}'"
                }
}
}
stage('Compile')
{
steps{
echo "Compiling the project"
bat "mvn compile"
}
}
stage('Deploy')
{
steps{
echo "Deploying the code"
}
}
}}