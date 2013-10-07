grails.project.work.dir = 'target'
grails.project.docs.output.dir = "docs"

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()
        mavenRepo "https://repository.corp.eharmony.com/nexus/content/repositories/thirdparty"
    }

    dependencies {
        compile "org.apache.ivy:ivy:2.2.0"
        compile("org.apache.maven:maven-ant-tasks:2.1.4") {
            excludes "commons-logging", "xml-apis", "groovy"
        }
        test("org.gmock:gmock:0.8.0") {
            export = false
        }
    }
}

grails.project.repos.'eh-thirdparty'.url = "https://repository.corp.eharmony.com/nexus/content/repositories/internal-snapshots/"
grails.project.repos.'eh-thirdparty'.username = "dshybeka"
grails.project.repos.'eh-thirdparty'.password = "IZC7hlzh00"
grails.project.repos.default = "eh-thirdparty"

//grails.project.repos.'plugin-repo'.url = "http://localhost:8081/nexus/content/repositories/snapshots/"
//grails.project.repos.'plugin-repo'.username = "admin"
//grails.project.repos.'plugin-repo'.password = "admin123"
//grails.project.repos.default = "plugin-repo"
