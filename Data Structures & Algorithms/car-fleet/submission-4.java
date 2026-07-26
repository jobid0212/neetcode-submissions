class Solution {

    // tuple
    record Car(int position, int speed){}

    public int carFleet(int target, int[] position, int[] speed) {
        // make list of tuples (position, speeed)
        // sort by position
        // add elements to arrraydeque

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            cars.add(new Car(position[i], speed[i]));
        }

        cars.sort(Comparator.comparingInt(Car::position));
        Deque<Car> carDeque = new ArrayDeque<>(cars);
        System.out.println(carDeque);

        int fleets = 1;

        Car currentCar = carDeque.pollLast();
        double prevTime = ((double)(target - currentCar.position())) / currentCar.speed();
        double currentTime;
        while (carDeque.size() > 0) {
            currentCar = carDeque.pollLast();
            currentTime = ((double)(target - currentCar.position())) / currentCar.speed();

            System.out.println(prevTime + " | " + currentTime);
            if (prevTime < currentTime) {
                fleets += 1;
                prevTime = currentTime;
            }

        }

        return fleets;
    }
}
