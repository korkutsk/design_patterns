public class SamsungPhoneFactory extends AbstractPhoneFactory {

    @Override
    Phone createPhone() {
        return new SamsungFold();
    }
}
