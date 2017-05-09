node {
  stage 'Run JMeter Test'
  sh 'C:/apache-jmeter-3.1/bin/jmeter.sh -n -t home/JMeter_API_Automation_Final.jmx -l test.jtl'
}
