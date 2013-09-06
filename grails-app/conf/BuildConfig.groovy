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
    }

    dependencies {
        compile("org.apache.maven:maven-ant-tasks:2.1.4-SNAPSHOT") {
            excludes "commons-logging", "xml-apis", "groovy"
        }
        test("org.gmock:gmock:0.8.0") {
            export = false
        }
    }
}

grails.project.repos.'manageReleases'.url = "https://repository.corp.eharmony.com/nexus/content/repositories/internal-snapshots/"
grails.project.repos.'manageReleases'.username = "dshybeka"
grails.project.repos.'manageReleases'.password = "IZC7hlzh00"
