# JOB DSL

They're just examples.

Please refer to https://github.com/jenkinsci/job-dsl-plugin/wiki for more information.

1. Install the plugin: https://github.com/jenkinsci/job-dsl-plugin
2. Create a `Freestyle` project on jenkins
3. In `Source Code Management` section enter this repository
4. Add `Process Job DSLs` as build step
5. Select `Look on Filesystem`
6. Enter `DSL/jobs/**/*.groovy` in DSL Scripts
7. Save and execute the job!