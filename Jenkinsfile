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
				echo 'running api tests'	
				sh 'mvn test -DsuiteXmlFile=runner/api.xml'
			}
		}
	}
}

