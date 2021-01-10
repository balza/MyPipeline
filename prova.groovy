String jobPrefix = 'balza'

pipelineJob("${jobPrefix}") {
    description('Build the Matrix Numbers BFF')
    echo "ciao"
}
