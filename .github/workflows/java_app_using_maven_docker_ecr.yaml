name: java-application-using-maven-and-docker-ECR

on:
  push:
    branches: [ main ]

env:
  IMAGE_NAME: sample-java-app
  # AWS_REGION: us-east-1
  # ECR_REPOSITORY: java-maven-ecr-demo
  # IMAGE_TAG: latest

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
    - name: Checkout the code
      uses: actions/checkout@v3
    
    - name: Setup Java JDK
      uses: actions/setup-java@v3.14.1
      with:
        java-version: '17'
        distribution: 'oracle'
    - name: Setup Maven
      uses: stCarolas/setup-maven@v5
      with:
        maven-version: '3.8.2'
    - name: building the package
      run: |
          mvn --version
          mvn clean install
          ls
    
    - name: Build Docker image
      run: |
        docker build -t $IMAGE_NAME .
        docker image ls
    # - name: Build with Maven
    #   run: mvn -B package --file pom.xml
    
    # - name: Run Tests
    #   run: mvn test
    
#   build-push-docker:
#     needs: build-test-sonar
#     runs-on: ubuntu-latest
#     permissions:
#       packages: write
#       contents: read
    
#     steps:
#     - uses: actions/checkout@v3
    
#     - name: Set up JDK 11
#       uses: actions/setup-java@v3
#       with:
#         java-version: '11'
#         distribution: 'temurin'
    
#     - name: Build with Maven
#       run: mvn -B package --file pom.xml
    
#     - name: Configure AWS credentials
#       uses: aws-actions/configure-aws-credentials@v2
#       with:
#         aws-access-key-id: ${{ secrets.AWS_ACCESS_KEY_ID }}
#         aws-secret-access-key: ${{ secrets.AWS_SECRET_ACCESS_KEY }}
#         aws-region: ${{ env.AWS_REGION }}
    
#     - name: Login to Amazon ECR
#       id: login-ecr
#       uses: aws-actions/amazon-ecr-login@v1
    
#     - name: Build, tag, and push image to Amazon ECR
#       id: build-image
#       env:
#         ECR_REGISTRY: ${{ steps.login-ecr.outputs.registry }}
#         ECR_REPOSITORY: ${{ env.ECR_REPOSITORY }}
#         IMAGE_TAG: ${{ github.sha }}
#       run: |
#         docker build -t $ECR_REGISTRY/$ECR_REPOSITORY:$IMAGE_TAG .
#         docker push $ECR_REGISTRY/$ECR_REPOSITORY:$IMAGE_TAG
#         echo "::set-output name=image::$ECR_REGISTRY/$ECR_REPOSITORY:$IMAGE_TAG"
    
#     - name: Push latest tag
#       run: |
#         ECR_REGISTRY=${{ steps.login-ecr.outputs.registry }}
#         docker tag $ECR_REGISTRY/${{ env.ECR_REPOSITORY }}:${{ github.sha }} $ECR_REGISTRY/${{ env.ECR_REPOSITORY }}:${{ env.IMAGE_TAG }}
#         docker push $ECR_REGISTRY/${{ env.ECR_REPOSITORY }}:${{ env.IMAGE_TAG }}
