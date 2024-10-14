pipeline{
agent any
stages
{
 stage('Checkout') {
            steps {
                checkout scm // Checkout the code from Git
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
echo "Testing the code"
bat "mvn test"
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