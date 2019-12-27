String basePath = 'DSL_TEST'
String repo = 'bsramin/jenkins-talk'

folder(basePath) {
    description 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dapibus eget massa at dictum.'
}

job("$basePath/git-log") {
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
        shell('git log')
    }
}