package top.yulegou.zeus.publish;/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import top.yulegou.zeus.dao.domain.ZPublishRule;
import top.yulegou.zeus.dao.domain.ZTask;
import top.yulegou.zeus.dao.domain.ZTaskConfig;
import top.yulegou.zeus.domain.ContentCollectedDTO;
import top.yulegou.zeus.domain.PublishResult;

import java.util.List;

/**
 * publisher 基类,定义发布内容哦调用的接口
 * @author irisroyalty
 * @date 2020/6/24
 **/
public interface BasePublishExecutor {
    int getPublishType();
    String getStringPublishType();
    int publish(List<ContentCollectedDTO> fieldList, ZTask zTask, ZPublishRule publishRule);
    PublishResult publish(ContentCollectedDTO content, ZTask zTask, ZPublishRule publishRule);
}
