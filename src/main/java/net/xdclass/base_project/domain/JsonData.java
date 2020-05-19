package net.xdclass.base_project.domain;

import java.io.Serializable;

/**
 * 功能描述：响应结果类
 * @author hdz
 */
public class JsonData implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 状态码 0 表示成功，1表示处理中，-1表示失败
	 */
	private Integer code;
	/**
	 * 数据
	 */
	private Object data;
	/**
	 * 描述
	 */
	private String msg;

	public JsonData() {
	}

	public JsonData(Integer code, Object data, String msg) {
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	/**
	 * 成功，传入数据
	 * @return JsonData
	 */
	public static JsonData buildSuccess() {
		return new JsonData(0, null, null);
	}

	/**
	 * 成功，传入数据
	 * @param data 数据
	 * @return JsonData
	 */
	public static JsonData buildSuccess(Object data) {
		return new JsonData(0, data, null);
	}

	/**
	 * 失败，传入描述信息
	 * @param msg 消息
	 * @return JsonData
	 */
	public static JsonData buildError(String msg) {
		return new JsonData(-1, null, msg);
	}

	/**
	 * 失败，传入描述信息,状态码
	 * @param msg  消息
	 * @param code 代号
	 * @return JsonData
	 */
	public static JsonData buildError(String msg, Integer code) {
		return new JsonData(code, null, msg);
	}

	/**
	 * 成功，传入数据,及描述信息
	 * @param data 数据
	 * @param msg  消息
	 * @return JsonData
	 */
	public static JsonData buildSuccess(Object data, String msg) {
		return new JsonData(0, data, msg);
	}

	/**
	 * 成功，传入数据,及状态码
	 * @param data 数据
	 * @param msg  消息
	 * @return JsonData
	 */
	public static JsonData buildSuccess(Object data, int code) {
		return new JsonData(code, data, null);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "JsonData [code=" + code + ", data=" + data + ", msg=" + msg + "]";
	}
}
