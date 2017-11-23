package win.log.greenUnion.controllor;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.constructor.BaseConstructor;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import win.log.base.Result;
import win.log.greenUnion.model.Admin;

@RestController
@RequestMapping("/api/admin")
@Api(value = "用户服务")
public class AdminController {
	@PostMapping("/add")
    @ApiOperation("添加")
    public Result<Admin>  add(@RequestBody Admin t) {
		return null;
    }

	@DeleteMapping("/delete")
	public Result<Boolean> delete(String id){
		return null;
	}
	@PostMapping("/update")
    @ApiOperation("修改")
    public Result  update(@RequestBody Admin t) {
        Result result = new Result();
        result.setT(t);
        return result;
    }
	@GetMapping("/disable/{id}")
	@ApiOperation("禁用")
	public Result<Admin> disable(@PathVariable String id){
		return null;
	}
	
	@GetMapping("/enable/{id}")
	@ApiOperation("起用")
	public Result<Admin> enable(@PathVariable String id){
		return null;
	}
	@PostMapping("/list")
	@ApiOperation("查询")
	public Page<Admin> list(@RequestBody Admin t){
		return null;
	}

}
