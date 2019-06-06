package kadai1;
import org.apache.commons.codec.digest.DigestUtils;
public class ToSHA2 {
	public String getDigest(String before) {
        String after = null;


        after = DigestUtils.sha256Hex(before);


        return after;
    }
}
