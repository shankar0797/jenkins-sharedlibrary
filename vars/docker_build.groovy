def call(Strinng ProjectName, String ImageTag, String DockerHubUser){
  sh " docker build -t ${DockerHubUser}/${ProjectName}: ${ImageTag} ."
}
