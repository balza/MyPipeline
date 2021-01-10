#!groovy
pipelineJob('prova') {
  node(){
    stage ('pipelines'){
        def pipeline = load 'prova'
        pipeline.execute()
    }
  }
}
