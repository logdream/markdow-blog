package win.log.greenUnion;


import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiOperation;
import win.log.base.Result;

public class BaseContoller<T> {
	@PostMapping("/add")
    @ApiOperation("添加")
    public Result  add(@RequestBody T t) {
        Result result = new Result();
        result.setT(t);
        return result;
    }

	@DeleteMapping("/delete")
	public Result delete(String id){
		return null;
	}
	@PostMapping("/update")
    @ApiOperation("修改")
    public Result  update(@RequestBody T t) {
        Result result = new Result();
        result.setT(t);
        return result;
    }
	
	@PostMapping("/list")
	@ApiOperation("查询")
	public Page<T> list(@RequestBody T t){
		return null;
	}

}
