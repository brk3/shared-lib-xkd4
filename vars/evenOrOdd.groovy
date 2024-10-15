// vars/evenOrOdd.groovy
def call(int buildNumber) {
  properties([
      parameters([
          choice(
              choices: ['ONE', 'TWO'],
              name: 'PARAMETER_01'
          )
      ])
  ])
  pipeline {
    agent any
    stages {
      stage('Even Stage') {
        steps {
          echo "The build number is even"
        }
      }
    }
  }
}
