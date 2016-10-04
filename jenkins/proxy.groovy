pc = new hudson.ProxyConfiguration("", 8080, "", "");
jenkins.model.Jenkins.instance.proxy = pc;
println "Jenkins-Proxy settings updated!"
