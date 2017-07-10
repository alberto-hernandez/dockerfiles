def env = System.getenv()

proxy_host = env["proxy_host"]
proxy_port = env["proxy_port"]

if (proxy_host != "" && proxy_port != "")
{
	pc = new hudson.ProxyConfiguration(proxy_host, proxy_port, "", "");
	jenkins.model.Jenkins.instance.proxy = pc;
	println "Jenkins-Proxy settings updated!"
}
