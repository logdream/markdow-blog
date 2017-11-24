package win.log.greenUnion.controllor;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import win.log.base.Result;
import win.log.greenUnion.model.Module;

@RestController
@RequestMapping("/api/module")
@Api(value = "模块管理")
public class ModuleController {

	@PostMapping("/add")
    @ApiOperation("添加")
    public Result<Module>  add(@RequestBody Module t) {
		return null;
    }

	@DeleteMapping("/delete")
	public Result delete(String id){
		return null;
	}
	@PostMapping("/update")
    @ApiOperation("修改")
    public Result  update(@RequestBody Module t) {
        Result result = new Result();
        result.setT(t);
        return result;
    }
	
	@PostMapping("/list")
	@ApiOperation("查询")
	public Page<Module> list(@RequestBody Module t){
		return null;
	}
	@PostMapping("/addAdmin")
	@ApiOperation("增加用户")
	public Result<String> addUser(String moduleId,String uid){
		return null;
	}
	@PostMapping("/removeAdmin")
	@ApiOperation("移除用户")
	public Result<String> deleteUser(String moduleId,String uid){
		return null;
	}
}
	