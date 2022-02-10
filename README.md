![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/kappsegla/server?display_name=tag&sort=semver&style=flat-square)
![dependabot status](https://img.shields.io/badge/dependabot-enabled-025e8c?logo=Dependabot&style=flat-square)
[![Java CI with Maven](https://github.com/kappsegla/server/actions/workflows/maven.yml/badge.svg?label=build)](https://github.com/kappsegla/server/actions/workflows/maven.y)


1. mvn package  or mvn -Dmaven.test.skip=true clean package
2. jlink --module-path target/app.jar --add-modules org.example.appserver --output target/standalone
3. docker build --tag NAME:TAG .
4. docker run NAME:TAG
