import hudson.tasks.Maven.MavenInstallation;
import hudson.tools.InstallSourceProperty;
import hudson.tools.ToolProperty;
import hudson.tools.ToolPropertyDescriptor;
import hudson.util.DescribableList;

def mavenExtension = jenkins.model.Jenkins.instance.getExtensionList(hudson.tasks.Maven.DescriptorImpl.class)[0]

def proplist = new DescribableList<ToolProperty<?>, ToolPropertyDescriptor>()
def isp = new InstallSourceProperty()

isp.installers.add(new hudson.tasks.Maven.MavenInstaller("3.6.0"))
proplist.add(isp)

mavenExtension.setInstallations(new MavenInstallation("Maven3", "", proplist))
mavenExtension.save()
