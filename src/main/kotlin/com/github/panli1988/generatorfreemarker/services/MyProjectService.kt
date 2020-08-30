package com.github.panli1988.generatorfreemarker.services

import com.intellij.openapi.project.Project
import com.github.panli1988.generatorfreemarker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
