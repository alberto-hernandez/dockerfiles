import jenkins.model.*
import hudson.security.*


def env = System.getenv()

admin_user = env["ADMIN_USER"]
admin_pass = env["ADMIN_PASS"]

if (admin_user != "" && admin_pass != "")
{
	def instance = Jenkins.getInstance()
	def hudsonRealm = new HudsonPrivateSecurityRealm(false)
	hudsonRealm.createAccount(admin_user, admin_pass)
	instance.setSecurityRealm(hudsonRealm)

	def strategy = new GlobalMatrixAuthorizationStrategy()
	strategy.add(Jenkins.ADMINISTER, admin_user)
	instance.setAuthorizationStrategy(strategy)

	instance.save()

}
