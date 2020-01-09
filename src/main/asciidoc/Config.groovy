outputPath = 'build'
inputPath = '.'

docversion = 'v1.0'

inputFiles = [
        [file: 'index.adoc', formats: ['html', 'docbook']]
             ]

taskInputsDirs = ["${inputPath}/images",
                 ]

taskInputsFiles = ["${inputPath}/index.adoc"]