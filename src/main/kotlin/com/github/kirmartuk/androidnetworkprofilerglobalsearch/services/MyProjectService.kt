package com.github.kirmartuk.androidnetworkprofilerglobalsearch.services

import com.intellij.openapi.project.Project
import com.github.kirmartuk.androidnetworkprofilerglobalsearch.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
