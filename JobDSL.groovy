job('JobDSL_1-clase3'){
    description('First JobDSL')
    scm{
        git("https://github.com/veram96/jenkins-shell-parametrized.git", 'main')
    }
    parameters {
        textParam('COSAS_QUE_APRENDI', 'uno\ndos\ntres', 'my description')
    }
}