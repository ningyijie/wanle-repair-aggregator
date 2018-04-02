package com.wanle.domain;



/**
 * 
 * 
 * 
 **/
public class User implements java.io.Serializable {


  private static final long serialVersionUID = 1L;


  /**自增长 id**/

  private Long id;


  /**用户的标识，对当前公众号唯一**/

  private String openid;


  /**用户的性别，值为1时是男性，值为2时是女性，值为0时是未知**/

  private Integer sex;


  /**绑定手机号**/

  private String mobile;


  /**绑定邮箱**/

  private String email;


  /**身份证号**/

  private Integer idNo;


  /**微信用户的昵称**/

  private String nickname;


  /**用户所在省份**/

  private String province;


  /**微信城市**/

  private String city;


  /**language**/

  private Integer language;


  /**用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。**/

  private String headimgurl;


  /**用户所在国家**/

  private String country;


  /**用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间**/

  private Long subscribeTime;


  /**用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。**/

  private Integer subscribe;


  /**公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注**/

  private Integer remark;


  /**用户所在的分组ID（兼容旧的用户分组接口）**/

  private Integer groupid;




  public void setId(Long id) { 
  }


  public Long getId() { 
  }


  public void setOpenid(String openid) { 
  }


  public String getOpenid() { 
  }


  public void setSex(Integer sex) { 
  }


  public Integer getSex() { 
  }


  public void setMobile(String mobile) { 
  }


  public String getMobile() { 
  }


  public void setEmail(String email) { 
  }


  public String getEmail() { 
  }


  public void setIdNo(Integer idNo) { 
  }


  public Integer getIdNo() { 
  }


  public void setNickname(String nickname) { 
  }


  public String getNickname() { 
  }


  public void setProvince(String province) { 
  }


  public String getProvince() { 
  }


  public void setCity(String city) { 
  }


  public String getCity() { 
  }


  public void setLanguage(Integer language) { 
  }


  public Integer getLanguage() { 
  }


  public void setHeadimgurl(String headimgurl) { 
  }


  public String getHeadimgurl() { 
  }


  public void setCountry(String country) { 
  }


  public String getCountry() { 
  }


  public void setSubscribeTime(Long subscribeTime) { 
  }


  public Long getSubscribeTime() { 
  }


  public void setSubscribe(Integer subscribe) { 
  }


  public Integer getSubscribe() { 
  }


  public void setRemark(Integer remark) { 
  }


  public Integer getRemark() { 
  }


  public void setGroupid(Integer groupid) { 
  }


  public Integer getGroupid() { 
  }

}