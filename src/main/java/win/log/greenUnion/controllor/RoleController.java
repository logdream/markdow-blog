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
import win.log.greenUnion.model.Role;

@RestController
@RequestMapping("/api/role")
@Api(value = "角色管理")
public class RoleController {

	@PostMapping("/add")
    @ApiOperation("添加")
    public Result<Role>  add(@RequestBody Role t) {
		return null;
    }

	@DeleteMapping("/delete")
	public Result delete(String id){
		return null;
	}
	@PostMapping("/update")
    @ApiOperation("修改")
    public Result  update(@RequestBody Role t) {
        Result result = new Result();
        result.setT(t);
        return result;
    }
	
	@PostMapping("/list")
	@ApiOperation("查询")
	public Page<Role> list(@RequestBody Role t){
		return null;
	}
	@PostMapping("/addAdmin")
	@ApiOperation("增加用户")
	public Result<String> addUser(String roleId,String uid){
		return null;
	}
	@PostMapping("/removeAdmin")
	@ApiOperation("移除用户")
	public Result<String> deleteUser(String roleId,String uid){
		return null;
	}
	
}
