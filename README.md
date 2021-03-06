ImageBox Server 2.0

ImageBox is a java-based image tiling server that implements (partial) the IIIF (https://iiif.io/) interface.  It is built on the OME Bioformats image library (https://github.com/ome/bioformats) which enables it to provide tiles for a variety of image formats.

ImageBox has an unusual capability in that it can provide tiling over HTTP using HTTP range requests which is particularly useful when hosting images (such as whole slide images for pathology) on cloud services like Amazon S3.

Notes:

ImageBox has it's own embedded HTTP server based on Eclipse Jetty (https://www.eclipse.org/jetty/).  JSON-LD support is provided by Apache Jena (https://jena.apache.org/)

