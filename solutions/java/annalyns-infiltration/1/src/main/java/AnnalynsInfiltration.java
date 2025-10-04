class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake){
            return false;
        }return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(!knightIsAwake && !archerIsAwake && !prisonerIsAwake){
            return false;
        }
        return true;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
          return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(!archerIsAwake &&  petDogIsPresent){
            if(!prisonerIsAwake || prisonerIsAwake && !knightIsAwake){
                return true;
            }
            else if(knightIsAwake){
                return true;
            }
        }else if(!knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return true;
        }
        return false;
    }
}
