String jobPrefix = 'matrix'

pipelineJob(jobPrefix + '-numbers-bff') {
    description('Build the Matrix Numbers BFF')
    sh 'mvn --version'
}