class NameNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return "Name not found";
    }
}
