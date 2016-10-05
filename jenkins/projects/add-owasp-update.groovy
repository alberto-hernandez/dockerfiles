import jenkins.model.*

def jobName = "OWASP Dependency-Check NVD Update2"

def configXML = "<?xml version='1.0' encoding='UTF-8'?> \
<project> \
  <actions/> \
  <description></description> \
  <keepDependencies>false</keepDependencies> \
  <properties>\
    <jenkins.model.BuildDiscarderProperty>\
      <strategy class='hudson.tasks.LogRotator'>\
        <daysToKeep>-1</daysToKeep>\
        <numToKeep>1</numToKeep>\
        <artifactDaysToKeep>-1</artifactDaysToKeep>\
        <artifactNumToKeep>-1</artifactNumToKeep> \
      </strategy>\
    </jenkins.model.BuildDiscarderProperty>\
  </properties>\
  <scm class='hudson.scm.NullSCM'/> \
  <canRoam>true</canRoam> \
  <disabled>false</disabled>  \
  <blockBuildWhenDownstreamBuilding>false</blockBuildWhenDownstreamBuilding> \
  <blockBuildWhenUpstreamBuilding>false</blockBuildWhenUpstreamBuilding> \
  <triggers> \
    <hudson.triggers.TimerTrigger>\
      <spec>@daily</spec> \
    </hudson.triggers.TimerTrigger> \
  </triggers> \
  <concurrentBuild>false</concurrentBuild> \
  <builders> \
    <org.jenkinsci.plugins.DependencyCheck.DependencyCheckUpdateOnlyBuilder plugin='dependency-check-jenkins-plugin@1.4.3'> \
      <skipOnScmChange>false</skipOnScmChange> \
      <skipOnUpstreamChange>false</skipOnUpstreamChange> \
      <datadir>\044{JENKINS_HOME}/owasp-nvd</datadir> \
      <isVerboseLoggingEnabled>false</isVerboseLoggingEnabled> \
    </org.jenkinsci.plugins.DependencyCheck.DependencyCheckUpdateOnlyBuilder> \
  </builders> \
  <publishers/> \
  <buildWrappers/> \
</project>"

def xmlStream = new ByteArrayInputStream (configXML.getBytes())

Jenkins.instance.createProjectFromXML (jobName, xmlStream)
