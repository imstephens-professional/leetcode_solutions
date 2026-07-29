//  8 ms - beats 61.72%
//  47.22 mb - beats 9.79%

class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        // 1=big, 2=med, 3=small
        switch(carType) {
            case 1:
                if(big > 0) {
                    big -= 1;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if(medium > 0) {
                    medium -= 1;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if(small > 0) {
                    small -= 1;
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }

    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
