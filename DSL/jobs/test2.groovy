String basePath = 'TEST2'
String repo = 'bsramin/jenkins-talk'

folder(basePath) {
    description 'Vivamus tempus condimentum tortor, sed varius turpis blandit ornare. Sed facilisis, purus eu cursus congue, felis arcu aliquam justo, vitae faucibus lacus libero iaculis massa.'
}

job("$basePath/get-date") {
    scm {
        git {
            remote {
                github(repo)
                credentials('github-ci-user')
            }
        }
    }
    triggers {
        cron 'H/5 * * * *'
    }
    steps {
        shell 'date'
    }
}

job("$basePath/get-ls") {
    scm {
        git {
            remote {
                github(repo)
                credentials('github-ci-user')
            }
        }
    }
    triggers {
        cron 'H/2 * * * *'
    }
    steps {
        shell 'ls'
    }
}