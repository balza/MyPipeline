String jobPrefix = 'matrix'

pipelineJob(jobPrefix + '-numbers-bff') {
    description('Build the Matrix Numbers BFF')
    properties {
        githubProjectUrl('https://github.developer.allianz.io/az-italy/matrix-numbers-java.git')
    }
}