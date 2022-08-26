
class floorPlan:

fun tiles(){
    quartzScacchi = 10.92
    ecologicSG = 18.14
    tuscanyCalacatta = 26.97
    galaxySun = 20.38
    freeflowSG = 16.81
    sandstormKalahari = 22.75
}
fun floorPlan(width,height){
    givenTile = input()
    if givenTile == quartzScacchi:
    quartzScacchi * width * height
    if givenTile == ecologicSG:
    ecologicSG * width * height
    if givenTile == galaxySun:
    galaxySun * width * height
    if givenTile == freeflowSG:
    freeflowSG * width * height
    if givenTile == sandstormKalahari:
    sandstormKalahari * width * height
    else: "Please give a valid tile input to calculate your floor plan."
}
