package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'Journey_Journey'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, BuildType({
    templates(RelativeId("JourneyExecution.JourneyExecutorTemplate"))
    id("Journey_Journey")
    name = "Journey"

    features {
        swabra {
            id = "swabra"
        }
    }

    dependencies {
        artifacts(RelativeId("JourneyMakerV1")) {
            id = "ARTIFACT_DEPENDENCY_26"
            buildRule = build("112")
            artifactRules = "Journey_script.py=>script"
        }
    }

    requirements {
        contains("env.COMPATIBLE_JOURNEY_TYPES", "WEB", "RQ_23")
    }
}))

