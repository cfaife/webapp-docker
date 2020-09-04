FROM jboss/wildfly
COPY target/webapp.war /opt/jboss/wildfly/standalone/deployments/webapp.war
