grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'

grails.project.repos.grailsCentral.username = System.getenv("GRAILS_CENTRAL_USERNAME")
grails.project.repos.grailsCentral.password = System.getenv("GRAILS_CENTRAL_PASSWORD")

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        //grailsCentral()
        //mavenLocal()
        //mavenCentral()

        mavenRepo 'https://repo1.maven.org/maven2/'
        mavenRepo 'https://repo.maven.apache.org/maven2/'
        mavenRepo 'https://repo.spring.io/milestone'
        mavenRepo "https://repo.grails.org/grails/core"
        mavenRepo "https://repo.grails.org/grails/plugins"

        mavenRepo "https://repository.mulesoft.org/nexus/content/repositories/public/"
        mavenRepo "https://repository.mulesoft.org/snapshots/"
        mavenRepo "http://download.java.net/maven/2/"

        mavenRepo "https://repository.jboss.org/maven2/"

        mavenRepo "http://oss.sonatype.org/content/repositories/vaadin-snapshots/"
        mavenRepo "http://maven.vaadin.com/vaadin-addons/"

        mavenRepo "https://repo.spring.io/release/"
        //https://community.jaspersoft.com/questions/1184741/3rd-party-repo-down web page de la solucion del problema de abajo
        mavenRepo "https://jaspersoft.jfrog.io/jaspersoft/third-party-ce-artifacts/"
    }

    dependencies {
        compile('com.lowagie:itext:2.1.7')

        compile('net.sf.jasperreports:jasperreports:jar:6.2.1') {
            excludes 'antlr', 'commons-logging',
                     'ant', 'mondrian', 'commons-javaflow','barbecue', 'xml-apis-ext','xml-apis', 'xalan', 'groovy-all', 'hibernate', 'saaj-api', 'servlet-api',
                     'xercesImpl','xmlParserAPIs','spring-core','bsh', 'spring-beans', 'jaxen', 'barcode4j','batik-svg-dom','batik-xml','batik-awt-util','batik-dom',
                     'batik-css','batik-gvt','batik-script', 'batik-svggen','batik-util','batik-bridge','persistence-api','jdtcore','bcmail-jdk16','bcprov-jdk16','bctsp-jdk16',
                     'bcmail-jdk14','bcprov-jdk14','bctsp-jdk14','xmlbeans', 'olap4j'
        }

        compile('org.apache.poi:poi:3.10-FINAL')
    }

    plugins {
        build ':release:3.0.1', ':rest-client-builder:2.0.3', {
            export = false
        }

        test(":hibernate4:4.3.6.1") {
            export = false
        }
        test(":tomcat:8.0.14.1") {
            export = false
        }
    }
}
