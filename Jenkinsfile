pipeline {

	agent any
	
	stages {
	
		stage('Hello') {
		
			steps {
				 echo 'Hello Dean'
			}
		}
		
		stage('Run API tests') {
			
			steps {			
				sh 'mvn test -DsuiteXmlFile=api-tests.xml'
			}
		}
	}
}

