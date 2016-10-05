pc = new hudson.ProxyConfiguration("$proxy_host", 8080, "", "");
jenkins.model.Jenkins.instance.proxy = pc;
println "Jenkins-Proxy settings updated!"
