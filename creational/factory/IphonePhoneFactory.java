public class IphonePhoneFactory extends AbstractPhoneFactory{
    @Override
    Phone createPhone() {
        return new IphoneXR();
    }
}
