import com.google.common.base.MoreObjects;

import com.illicis.model.DownstreamHttpData;

public class DownstreamHttpDataTest implements DownstreamHttpData {

  private String nameTest;

  private String scoreTest;

  public DownstreamHttpDataTest(String nameTest, String scoreTest) {
    this.nameTest = nameTest;
    this.scoreTest = scoreTest;
  }

  public String getNameTest() {
    return nameTest;
  }

  public String getScoreTest() {
    return scoreTest;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("nameTest", nameTest)
        .add("scoreTest", scoreTest)
        .toString();
  }
}
