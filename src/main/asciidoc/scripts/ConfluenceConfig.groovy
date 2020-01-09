input = [
        [ file: "build/html5/index.html", ancestorId: 1081783, preambleTitle: "Macro architecture"]
]

confluenceAPI = 'https://confluence.swisslog.net/rest/api/'
confluenceSpaceKey = 'SLSCS'
confluenceCreateSubpages = true
confluencePagePrefix = ''
confluenceCredentials = "documentationpublisher:swisslog".bytes.encodeBase64().toString()
//confluenceCredentials = new File('/opt/secret').text.bytes.encodeBase64().toString()
extraPageContent = '<ac:structured-macro ac:name="warning"><ac:parameter ac:name="title" /><ac:rich-text-body>This is a generated page, do not edit!</ac:rich-text-body></ac:structured-macro>'